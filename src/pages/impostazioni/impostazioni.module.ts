import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ImpostazioniPage } from './impostazioni';

@NgModule({
  declarations: [
    ImpostazioniPage,
  ],
  imports: [
    IonicPageModule.forChild(ImpostazioniPage),
  ],
  exports: [
    ImpostazioniPage
  ]
})
export class ImpostazioniPageModule {}
