import { Component, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
//import { EventEmitter } from 'stream';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent {

  username:string='';
  password:string='';

  @Output() add:EventEmitter<any> = new EventEmitter<any>();
  constructor(
    
  ) {

   }

   onUsernameChange(e:any){
     this.username=e.target.value;
   }
   onPasswordChange(e:any){
    this.password=e.target.value;
  }//look into the Forms module more closely to implement it 

}
