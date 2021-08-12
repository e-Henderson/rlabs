import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductComponent } from './products/product.component';

@NgModule({//This module collects related code into functional sets
  //this would be the root module since it has bootstrapping
  //applications have at least 1 root module
  declarations: [
    AppComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]//root component
})
export class AppModule { }
