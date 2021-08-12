import { Component } from '@angular/core';
/*
app.components.ts is used to define the actual logic for the 
root component of the application. In this case, the root
component is AppComponent.
*/
@Component({//@Component is a decorator
  //Angular apps can have multiple components 
  selector: 'app-root',
  templateUrl: './app.component.html',
  //template: `
  //<h2>This is rendered from class</h2>
  //{{title}}`,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Eddie';
  inactive = false;
  addProduct:boolean = false;

  picture = 'somenice.jpeg'
  supplier={
    name:'Amazon'
  }

  vehicles = ['Car','truck','bus']

  getTitle(){
    return this.title;
  }

  sayHello(){
    console.log("Hello")
    this.title="Changed"
  }

  onRemoveProduct(e:Event){
    console.log(e)
  }
}
