import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ArchivioPage } from './archivio';

@NgModule({
  declarations: [
    ArchivioPage,
  ],
  imports: [
    IonicPageModule.forChild(ArchivioPage),
  ],
  exports: [
    ArchivioPage
  ]
})
export class ArchivioPageModule {}
