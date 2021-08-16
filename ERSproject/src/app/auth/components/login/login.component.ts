import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(private http: HttpClient, private router:Router) { }//might cause problem

  onSubmit(form: NgForm){//problem is here somewhere, though not sure where 
    console.log(form);
    this.http.post('http://localhost:8080/project1-backend/login',
    JSON.stringify({username:form.value.username,password:form.value.password}))
    .subscribe({
        next: (data:any)=>{
            if(data.status === 'success') {
                localStorage.setItem("username", form.value.username);
            }
            this.router.navigate([''])
        }
    })    
  }
}
