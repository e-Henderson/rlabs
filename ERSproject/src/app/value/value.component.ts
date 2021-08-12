import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-value',
  templateUrl: './value.component.html',
  styleUrls: ['./value.component.css']
})
export class ValueComponent implements OnInit {
  values: any;
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.getValues();
  }
  
  getValues(){//keep in mind tht url below. might cause problems later on
    return this.http.get("http://localhost:57353/api/values").subscribe(response => {
      console.log(response);
      this.values=response;
    },error=>{
      console.log(error);
    });//is an Observable
  }
}