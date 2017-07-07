webpackJsonp([6],{

/***/ 264:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PreferitiPageModule", function() { return PreferitiPageModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(38);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__preferiti__ = __webpack_require__(274);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var PreferitiPageModule = (function () {
    function PreferitiPageModule() {
    }
    return PreferitiPageModule;
}());
PreferitiPageModule = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["a" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__preferiti__["a" /* PreferitiPage */],
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["d" /* IonicPageModule */].forChild(__WEBPACK_IMPORTED_MODULE_2__preferiti__["a" /* PreferitiPage */]),
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_2__preferiti__["a" /* PreferitiPage */]
        ]
    })
], PreferitiPageModule);

//# sourceMappingURL=preferiti.module.js.map

/***/ }),

/***/ 274:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PreferitiPage; });
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
 * Generated class for the PreferitiPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
var PreferitiPage = (function () {
    function PreferitiPage(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    PreferitiPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad PreferitiPage');
    };
    PreferitiPage.prototype.funzione = function () {
        this.navCtrl.push('ProfiloPage');
    };
    PreferitiPage.prototype.funzione5 = function () {
        this.navCtrl.push('RicercaPage');
    };
    return PreferitiPage;
}());
PreferitiPage = __decorate([
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* IonicPage */])(),
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_6" /* Component */])({
        selector: 'page-preferiti',template:/*ion-inline-start:"C:\Users\Marcodav\ionicJS\src\pages\preferiti\preferiti.html"*/'<ion-header>\n<ion-navbar color="secondary"> \n    <ion-title> <ion-icon name="heart" ></ion-icon>  Preferiti</ion-title>\n     <ion-buttons end>\n         <button  ion-button icon-only icon-right (click)="funzione5()"> <ion-icon md="md-search"></ion-icon></button> </ion-buttons>\n  </ion-navbar>\n</ion-header>\n\n\n<ion-content padding>\n<ion-list>\n  <ion-item-sliding>\n    <ion-item (click)="funzione()">\n      <ion-avatar item-start>\n        <img src="assets/icon/logo.jpg" alt=""/>\n      </ion-avatar>\n      <h2>Professionista</h2>\n    </ion-item>\n    <ion-item-options side="right">\n      <button ion-button color="message">\n        <ion-icon name="text"></ion-icon>\n        Text\n      </button>\n      <button ion-button color="call">\n        <ion-icon name="call"></ion-icon>\n        Call\n      </button>\n      <button ion-button (click)="funzione()">\n        <ion-icon name="more"></ion-icon>\n        Apri\n      </button>  \n    </ion-item-options>\n   \n  </ion-item-sliding>\n</ion-list>\n</ion-content>\n'/*ion-inline-end:"C:\Users\Marcodav\ionicJS\src\pages\preferiti\preferiti.html"*/,
    }),
    __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* NavParams */]])
], PreferitiPage);

//# sourceMappingURL=preferiti.js.map

/***/ })

});
//# sourceMappingURL=6.main.js.map