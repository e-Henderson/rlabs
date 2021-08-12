import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map} from 'rxjs/operators'

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  authUrl = "http://localhost:57353/api/auth/"//use this for postman later
  constructor(private http: HttpClient) { }

  login(model:any){//gives an observable
    return this.http.post(this.authUrl + 'login', model).pipe(
      map((response:any)=>{
        const user=response;
        if(user.result.succeeded){
          localStorage.setItem('token', user.token);
        }
      })
    )
  }
}
