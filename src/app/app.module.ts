import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';


import { MyApp } from './app.component';


import { AccountProvider } from '../providers/account.provider';
import {UserPersistanceProvider} from '../providers/user-persistance.provider';
import {TaskProvider} from '../providers/task.provider';

import {HttpModule} from '@angular/http';
import { IonicStorageModule } from '@ionic/storage';

import {DictionaryModule} from '../modules/dictionary/dictionary.module';

@NgModule({
  declarations: [
    MyApp
    
  ],
  imports: [
    BrowserModule,
    HttpModule,
    IonicStorageModule.forRoot({
            name: '__jobservice',
        }),
    IonicModule.forRoot(MyApp),
    DictionaryModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp
    
  ],
  providers: [
    StatusBar,
    
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    AccountProvider,
    UserPersistanceProvider,
    TaskProvider
    
  ]
})
export class AppModule {}
