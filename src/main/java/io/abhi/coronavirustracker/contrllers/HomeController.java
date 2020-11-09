package io.abhi.coronavirustracker.contrllers;
import io.abhi.coronavirustracker.model.Locationstats;
import io.abhi.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;//to make the service access to the view part.

    @GetMapping("/")
    public String home(Model model){
        List<Locationstats> allstats = coronaVirusDataService.getAllstats();
        int totalReportedCases = allstats.stream().mapToInt(val -> val.getLatestTotalCases()).sum();
        int totalNewCases = allstats.stream().mapToInt(val->val.getDiffFromprevDay()).sum();
        model.addAttribute("locationStats", allstats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalNewCases",totalNewCases);
        return "home";
    }
}
