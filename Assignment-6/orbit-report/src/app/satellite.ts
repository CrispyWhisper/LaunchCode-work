export class Satellite {
    name: string;
    orbitType: string;
    type: string;
    operational: boolean;
    launchDate: string;
    shouldShowWarning: boolean = false;
    isSpaceDebris() {
        if(this.type == "Space Debris" || this.type == "space debris") {
            console.log("this function ran");
            console.log(this.type);
            return this.shouldShowWarning = true;
        }
    };

    constructor(name: string, type: string, launchDate: string, orbitType: string, operational: boolean){
        this.name = name;
        this.type = type;
        this.launchDate = launchDate;
        this.orbitType = orbitType;
        this.operational = operational;
    };

    
}

