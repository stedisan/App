import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ModificapPage } from './modificap';

import { DictionaryModule } from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    ModificapPage,
  ],
  imports: [
	DictionaryModule,
    IonicPageModule.forChild(ModificapPage),
  ],
  exports: [
    ModificapPage
  ]
})
export class ModificapPageModule {}
