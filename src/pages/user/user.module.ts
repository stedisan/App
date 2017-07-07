import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { UtentePage } from './user';

@NgModule({
  declarations: [
    UserPage,
  ],
  imports: [
    IonicPageModule.forChild(UserPage),
  ],
  exports: [
    UserPage
  ]
})
export class UserPageModule {}
