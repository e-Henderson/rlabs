import { Component, OnInit, Output,EventEmitter } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string=''
  price:string=''

  @Output() add:EventEmitter<any> = new EventEmitter<any>();
  constructor(){
   
  }
  onTitleInput(e:any){
    this.title=e.target.value;
  }
  onPriceInput(e:any){
    this.price=e.target.value;
  }

  addProduct(){
    this.add.emit({title:this.title, price:this.price});
  }
  ngOnInit(){
   
  }

}
