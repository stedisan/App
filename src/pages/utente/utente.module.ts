import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { UtentePage } from './utente';

@NgModule({
  declarations: [
    UtentePage,
  ],
  imports: [
    IonicPageModule.forChild(UtentePage),
  ],
  exports: [
    UtentePage
  ]
})
export class UtentePageModule {}
