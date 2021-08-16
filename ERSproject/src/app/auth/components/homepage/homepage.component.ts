import {Component} from "@angular/core";
import {Router} from "@angular/router";

@Component({
    selector: 'app-home',
    templateUrl:'./homepage.component.html' 
})
export class HomeComponent{
    constructor(private router:Router){}

    logout(){
        localStorage.clear()
        this.router.navigate(['login'])
    }
}