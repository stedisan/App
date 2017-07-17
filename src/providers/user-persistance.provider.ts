import {Injectable} from '@angular/core';
import {Storage} from '@ionic/storage';

//Interface
import {UserPersistanceInterface} from '../interfaces/userpersistance.interface';

//Models
import {Utente} from '../models/utente.model';

//Constants
import {STORAGE_KEYS} from '../constants';

@Injectable()
export class UserPersistanceProvider implements UserPersistanceInterface {

    constructor(private _storage: Storage) {
        console.log('Hello UserPersistance Provider');
    }
    
    save(user: Utente): Promise<any> {
        return new Promise((resolve, reject) => {
            this._storage.set(STORAGE_KEYS.USER, user)
                .then(() => {
                    resolve();
                })
                .catch(() => {
                    reject();
                });
        });
    }
    
    get(): Promise<Utente> {
        return new Promise((resolve, reject) => {
            this._storage.get(STORAGE_KEYS.USER)
                .then((user) => {
                    if (user !== null) {
                        resolve(new Utente(user));
                    } else {
                        reject();
                    }
                })
        });
    }
    
    remove(): Promise<any> {
        return new Promise((resolve, reject) => {
            this._storage.remove(STORAGE_KEYS.USER)
                .then(() => {
                    resolve();
                })
                .catch(() => {
                    reject();
                })
        });
    }

}

