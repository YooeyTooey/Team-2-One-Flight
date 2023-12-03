package com.uap.Team2OneFlight.backend;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;

public class FlightOffersSearch {

  public static void main(String[] args) throws ResponseException {

    Amadeus amadeus = Amadeus
        .builder("2ig5P24mry8Jmx77wehAhzHu4VoiRcvr","JFX4Eu1jAdtUXWxp")
        .build();

    FlightOfferSearch[] flightOffersSearches = amadeus.shopping.flightOffersSearch.get(
                  Params.with("originLocationCode", "SYD")
                          .and("destinationLocationCode", "BKK")
                          .and("departureDate", "2023-12-04")
                          .and("returnDate", "2023-12-08")
                          .and("adults", 2)
                          .and("max", 3));

    if (flightOffersSearches[0].getResponse().getStatusCode() != 200) {
        System.out.println("Wrong status code: " + flightOffersSearches[0].getResponse().getStatusCode());
        System.exit(-1);
    }

    System.out.println(flightOffersSearches[0]);
  }
}
