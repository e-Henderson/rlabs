//this will just be a fake backend for this project
//will probably convert this file to communicate with
//the actual java server stuff
import { Injectable } from "@angular/core";
import { HttpRequest, HttpResponse, HttpHandler,HttpEvent,HttpInterceptor,HTTP_INTERCEPTORS} from '@angular/common/http';
import { Observable, of,throwError } from "rxjs";
import { delay, mergeMap,materialize,dematerialize } from 'rxjs/operators';


let users = [{id:1,firstname: 'Tyler',lastname: 'Henderson', username:'tester',password:'password'}];

//define Injectable
@Injectable()
export class FakeBackendInterceptor implements HttpInterceptor{
    intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
        const {url, method,headers,body}=request;
        //wrap observable to simulate a server api
        return of(null)
            .pipe(mergeMap(handleRoute))
            .pipe(materialize())
            .pipe(delay(500))
            .pipe(dematerialize());

        function handleRoute(){
            switch(true){
                case url.endsWith('/users/authenticate') && method==='POST':
                    return authenticate();
                default:
                    return next.handle(request);
            }
        }

        //route functions
        function authenticate(){
            const{username,password} = body;
            const user= users.find(x=> x.username === username && x.password===password);
            if (!user) return error('Username or password is incorrect');
            return ok({
                id:user.id,
                username: user.username,
                firstName:user.firstname,
                lastName:user.lastname,
                token: 'fake-jwt-token'
            })
        }
        //helper func
        function ok(body?: { id: number; username: string; firstName: string; lastName: string; token: string; }){
            return of(new HttpResponse({ status: 200,body}))
        }
        //might need to change these types that I added later but just go with it for now
        function error(message: string){
            return throwError({error: {message}});
        }
    }
}

export const fakeBackendProvider={
    provide: HTTP_INTERCEPTORS,
    useClass: FakeBackendInterceptor,
    multi: true
}