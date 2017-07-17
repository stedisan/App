import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { RegistrazionePage } from './registrazione';

import {DictionaryModule} from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    RegistrazionePage,
  ],
  imports: [
   DictionaryModule,
    IonicPageModule.forChild(RegistrazionePage),
  ],
  exports: [
    RegistrazionePage
  ]
})
export class RegistrazionePageModule {}
