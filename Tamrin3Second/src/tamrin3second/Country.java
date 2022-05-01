/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamrin3second;

import com.sun.jdi.request.VMDeathRequest;

public class Country {

    private String Name;
    private long Population;//jamiat
    private long Perpetrator;//daramad sarane hR SHkhs
    private long Area;
    private String Capital;

    public Country() {
        Name = "nothing";
        Population = 0;
        Perpetrator = 0;
        Area = 0;
        Capital = "dose not exist";
    }

    public Country(String Name, long Population, long Perpetrator, long Area, String Capital) {
        if (Name.trim().length() > 3) {
            this.Name = Name;
        } else {
            this.Name = "Does not exist";
        }
        if (Population > 100) {
            this.Population = Population;
        } else {
            this.Population = 0;
        }
        if (Perpetrator > 1000000) {
            this.Perpetrator = Perpetrator;
        } else {
            Perpetrator = 0;
        }
        if (Area > 100) {
            this.Area = Area;
        } else {
            Area = 0;
        }
        if (Capital.trim().length() > 3) {
            this.Capital = Capital;
        } else {
            Capital = " Does not exist";
        }
    }

    public Country(Country c) {
        this.Name = c.Name;
        this.Population = c.Population;
        this.Perpetrator = c.Perpetrator;
        this.Area = c.Area;
        this.Capital = c.Capital;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setPopulation(long Population) {
        this.Population = Population;
    }

    public long getPopulation() {
        return this.Population;
    }

    public void setPerpetrator(long Perpetrator) {
        this.Perpetrator = Perpetrator;
    }

    public long getPerpetrator() {
        return this.Perpetrator;
    }
    public void setArea(long Area){
        this.Area = Area;
    }
    public long getArea(){
        return this.Area;
    }
    public void setCapital(String Capital){
        this.Capital = Capital;
    }
    public String getCapital(){
        return this.Capital;
    }
    public String toString(){
        return "{"+"Name : " +Name+",   Population :"+Population+
                ",   Perpetrator : "+Perpetrator+",   Area :"+Area+
                " Km^2,   Capital : "+Capital+"}";
    }
    public boolean equals(Country c){
        return (Name.equals(c.Name) && Population == c.Population && Perpetrator == c.Perpetrator && Area == c.Area && Capital.equals(c.Capital) );
    }
    public String density(){
        return ("Density "+Name+" = "+Population/Area+" people live in 1km^2");
    }
}
        