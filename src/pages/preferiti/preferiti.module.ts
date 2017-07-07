import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { PreferitiPage } from './preferiti';

import { DictionatyModule } from '../../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    PreferitiPage,
  ],
  imports: [
	DictionatyModule,
    IonicPageModule.forChild(PreferitiPage),
  ],
  exports: [
    PreferitiPage
  ]
})
export class PreferitiPageModule {}
