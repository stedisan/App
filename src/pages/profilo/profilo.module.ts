import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ProfiloPage } from './profilo';

import {DictionaryModule} from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    ProfiloPage,
  ],
  imports: [
	DictionaryModule,
    IonicPageModule.forChild(ProfiloPage),
  ],
  exports: [
    ProfiloPage
  ]
})
export class ProfiloPageModule {}
