package lesson_4.application;

import lesson_4.transportClasses.CivilAirTransport;
import lesson_4.transportClasses.FreightLandTransport;
import lesson_4.transportClasses.LightLandTransport;
import lesson_4.transportClasses.MilitaryAirTransport;

public class Lesson4 {
    public static void main(String[] args) {

    CivilAirTransport Civil = new CivilAirTransport();
    Civil.enterParams();
    Civil.outputCharacterCivilAirTrans();
    Civil.enterNumPassenger();

    MilitaryAirTransport Military = new MilitaryAirTransport();
    Military.enterParams();
    Military.outputCharactMilitAirTrans();
    Military.gunshot();
    Military.ejection();

    FreightLandTransport Freight = new FreightLandTransport();
    Freight.enterParams();
    Freight.outputCharacterFreighLandTrans();
    Freight.enterWeightCargo();

    LightLandTransport Light = new LightLandTransport();
    Light.enterParams();
    Light.outputCharacterLighLandTrans();
    Light.enterTimeForMaxDistance();
    }
}
