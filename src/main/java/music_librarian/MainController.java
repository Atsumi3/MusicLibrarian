package music_librarian;

import com.google.gson.Gson;
import music_librarian.model.Disc;
import music_librarian.viewmodel.DiscDetailViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Controller
@EnableAutoConfiguration
public class MainController {
    private final ResourceLoader resourceLoader;

    @Autowired
    public MainController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @RequestMapping("/")
    public String home(Model model) {
        Disc disc = new Gson().fromJson(getSampleJson("disc_detail"), Disc.class);
        final DiscDetailViewModel viewModel = new DiscDetailViewModel(disc);
        model.addAttribute("viewModel", viewModel);
        return "discDetail";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainController.class, args);
    }

    private String getSampleJson(@SuppressWarnings("SameParameterValue") String jsonName) {
        try {
            String filepath = "/static/sample/" + jsonName + ".json";
            Resource resource = resourceLoader.getResource("classpath:" + filepath);
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
