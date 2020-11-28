import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import {HomeComponent} from'./components/home/home.component' ;
import{ViewRegistrationComponent} from './components/view-registration/view-registration.component' ;
import * as tslib_1 from "tslib" ;
const routes: Routes = [{
path:'',
component:AdminComponent
},
{
  path: 'admin/view/:id',
  component: ViewRegistrationComponent
},
{
  path: 'admin',
  component: AdminComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
