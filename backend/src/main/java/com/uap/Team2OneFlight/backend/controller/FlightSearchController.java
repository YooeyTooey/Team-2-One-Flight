package com.uap.Team2OneFlight.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.uap.Team2OneFlight.backend.models.FlightSearchForm;

@Controller
public class FlightSearchController {

    @GetMapping("/flight-search")
    public String showFlightSearchForm(Model model) {
        model.addAttribute("flightSearchForm", new FlightSearchForm());
        return "flightSearch";
    }

    @PostMapping("/flight-search")
    public String submitFlightSearchForm(FlightSearchForm flightSearchForm, Model model) {
        Amadeus amadeus = Amadeus
                .builder("2ig5P24mry8Jmx77wehAhzHu4VoiRcvr", "JFX4Eu1jAdtUXWxp")
                .build();

        try {
            FlightOfferSearch[] flightOffersSearches = amadeus.shopping.flightOffersSearch.get(
                    Params.with("originLocationCode", flightSearchForm.getOriginLocationCode())
                            .and("destinationLocationCode", flightSearchForm.getDestinationLocationCode())
                            .and("carrierCode", flightSearchForm. )
                            .and("departureDate", flightSearchForm.getDepartureDate())
                            .and("returnDate", flightSearchForm.getReturnDate())
                            .and("adults", flightSearchForm.getAdults())
                            .and("max", 3));

            if (flightOffersSearches[0].getResponse().getStatusCode() != 200) {
                System.out.println("Wrong status code: " + flightOffersSearches[0].getResponse().getStatusCode());
                System.exit(-1);
            }

            model.addAttribute("flightOffers", flightOffersSearches[0].getType());
        } catch (ResponseException e) {
            // Handle the exception, for now, we'll print the error to the console
            e.printStackTrace();
            model.addAttribute("error", "Error retrieving flight offers: " + e.getDescription());
        }

        return "flightSearchResults";
    }
}
