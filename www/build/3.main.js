webpackJsonp([3],{

/***/ 267:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegistrazionePageModule", function() { return RegistrazionePageModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__registrazione__ = __webpack_require__(277);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var RegistrazionePageModule = (function () {
    function RegistrazionePageModule() {
    }
    return RegistrazionePageModule;
}());
RegistrazionePageModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__registrazione__["a" /* RegistrazionePage */],
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["d" /* IonicPageModule */].forChild(__WEBPACK_IMPORTED_MODULE_2__registrazione__["a" /* RegistrazionePage */]),
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_2__registrazione__["a" /* RegistrazionePage */]
        ]
    })
], RegistrazionePageModule);

//# sourceMappingURL=registrazione.module.js.map

/***/ }),

/***/ 277:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RegistrazionePage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Generated class for the RegistrazionePage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
var RegistrazionePage = (function () {
    function RegistrazionePage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    RegistrazionePage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad RegistrazionePage');
    };
    RegistrazionePage.prototype.registrati = function () {
        console.log('sei registrato');
        this.navCtrl.push('LoginPage');
    };
    return RegistrazionePage;
}());
RegistrazionePage = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* IonicPage */])(),
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_6" /* Component */])({
        selector: 'page-registrazione',template:/*ion-inline-start:"C:\Users\Marcodav\ionicJS\src\pages\registrazione\registrazione.html"*/'\n<ion-header>\n\n  <ion-navbar color="secondary">\n    <ion-title>Registrazione</ion-title>\n  </ion-navbar>\n\n</ion-header>\n\n\n<ion-content padding>\n\n    <ion-list no-lines> \n        <ion-item>\n                <ion-input type="text" placeholder="Nome"> </ion-input>\n        </ion-item>\n        <ion-item>\n                <ion-input type="text" placeholder="Cognome"> </ion-input>\n        </ion-item>\n        <ion-item>\n                <ion-input type="text" placeholder="Email"> </ion-input>\n        </ion-item>\n        <ion-item>\n                <ion-input type="text" placeholder="Username"> </ion-input>\n        </ion-item>\n        <ion-item>\n                <ion-input type="password" placeholder="Password"> </ion-input>\n        </ion-item>\n        <ion-item>\n                <ion-input type="password" placeholder="Ripeti password"> </ion-input>\n        </ion-item>\n    </ion-list>\n    <button ion-button color="secondary" block (click)="registrati()"> Registrati </button>\n</ion-content>\n'/*ion-inline-end:"C:\Users\Marcodav\ionicJS\src\pages\registrazione\registrazione.html"*/,
    }),
    __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */]])
], RegistrazionePage);

//# sourceMappingURL=registrazione.js.map

/***/ })

});
//# sourceMappingURL=3.main.js.map