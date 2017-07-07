import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ImpostazioniPage } from './impostazioni';

import {DictionaryModule} from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    ImpostazioniPage,
  ],
  imports: [
	DictionaryModule,
    IonicPageModule.forChild(ImpostazioniPage),
  ],
  exports: [
    ImpostazioniPage
  ]
})
export class ImpostazioniPageModule {}
