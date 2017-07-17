import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ModificapPage } from './modificap';

@NgModule({
  declarations: [
    ModificapPage,
  ],
  imports: [
    IonicPageModule.forChild(ModificapPage),
  ],
  exports: [
    ModificapPage
  ]
})
export class ModificapPageModule {}
