import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { RicercaPage } from './ricerca';

@NgModule({
  declarations: [
    RicercaPage,
  ],
  imports: [
    IonicPageModule.forChild(RicercaPage),
  ],
  exports: [
    RicercaPage
  ]
})
export class RicercaPageModule {}
