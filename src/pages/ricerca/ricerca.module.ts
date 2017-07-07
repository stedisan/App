import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { RicercaPage } from './ricerca';

import {DictionaryModule} from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    RicercaPage,
  ],
  imports: [
	DictionaryModule,
    IonicPageModule.forChild(RicercaPage),
  ],
  exports: [
    RicercaPage
  ]
})
export class RicercaPageModule {}
