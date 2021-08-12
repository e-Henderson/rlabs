//routing module for the app
//is configured as an array of Routes
/*each component is mapped to a path so the Router 
knows where each component is and where to go based
on the url in the browser bar
*/

import { Routes,RouterModule } from "@angular/router";

import { WelcomeComponent } from "./welcome";
import { LoginComponent } from "./Login";
import { RegisterComponent } from "./Register";

const routes: Routes=[//array of routes that will be used
    {path: '', component: WelcomeComponent},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},

    //below will automatically redirect to home. or should.
    {path: '**', redirectTo:''}
];

export const appRoutingModule = RouterModule.forRoot(routes);