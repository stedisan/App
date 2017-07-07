import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { PrenotazionePage } from './prenotazione';

import { DictionaryModule } from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    PrenotazionePage,
  ],
  imports: [
	DictionaryModule,
    IonicPageModule.forChild(PrenotazionePage),
  ],
  exports: [
    PrenotazionePage
  ]
})
export class PrenotazionePageModule {}
