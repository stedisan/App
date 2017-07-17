export class Utente {
    
    username: string = "";
    email: string = "";
    nome: string = "";
    cognome: string = "";
    età: string = "";
    città: string = "";
    telefono: string = "";
	data_di_nascita: string = "";
    
    
    token: string = "";
    
    constructor(obj?: any) {
        this.setObj(obj);
    }
    
    setObj(obj?: any) {
        if (obj) {
            this.username = obj.username || this.username;
            this.email = obj.email || this.email;
            this.nome = obj.nome || this.nome;
            this.cognome = obj.cognome || this.cognome;
            this.età = obj.età || this.età;
            this.città = obj.città || this.città;
            this.telefono = obj.telefono || this.telefono;
	    this.data_di_nascita = obj.data_di_nascita || this.data_di_nascita;
            this.token = obj.token || this.token;
        }
    }
    
}


