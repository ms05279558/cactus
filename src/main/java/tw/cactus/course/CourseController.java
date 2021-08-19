package tw.cactus.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tw.cactus.cactusbean.CactusBean;
import tw.cactus.cactusbean.CactusBeanDao;

@Controller
public class CourseController {

    @Autowired
    private CactusBeanDao cDao;
    @Autowired
    private CactusBean cBean;
    @Autowired
    private CourseRepo courseBD;
    
 
    
    @GetMapping("/typeofcoding")
    public String getCourseSessions(Model m) {
        List<CourseBean> codinglist = courseBD.findCourseTypeOfCoding();
        m.addAttribute("cactusCourse",codinglist);
        return "coding01";
    }
    @GetMapping("/typeofsport")
    public String getCourseSessions1(Model m) {
        List<CourseBean> sportlist = courseBD.findCourseTypeOfSport();
        m.addAttribute("cactusCourse",sportlist);
        return "sport02";
    }
    @GetMapping("/typeofmusic")
    public String getCourseSessions2(Model m,Model m1) {
        List<CourseBean> musiclist = courseBD.findCourseTypeOfMusic();
        int j=0;
        int i = 0;
        while(i<musiclist.size()) {        	
        	j += musiclist.get(i).getPrice();    	
        	i++;        	
        }
        CourseBean totalPriceModel = new CourseBean();
        totalPriceModel.setPrice(j);
//        System.out.println(musiclist.get(0).getPrice());
//        System.out.println(musiclist.get(1).getPrice());
        m.addAttribute("cactusCourse",musiclist);
        m1.addAttribute("totalPriceModel",totalPriceModel);
        return "music03";
    }
    @GetMapping("/typeoflan")
    public String getCourseSessions3(Model m) {
        List<CourseBean> lanlist = courseBD.findCourseTypeOfLan();
        m.addAttribute("cactusCourse",lanlist);
        return "lan04";
    }
    @GetMapping("/typeofeconomy")
    public String getCourseSessions4(Model m) {
        List<CourseBean> economylist = courseBD.findCourseTypeOfEconomy();
        m.addAttribute("cactusCourse",economylist);
        return "economy05";
    }
    @GetMapping("/typeofphoto")
    public String getCourseSessions5(Model m) {
        List<CourseBean> photolist = courseBD.findCourseTypeOfLan();
        m.addAttribute("cactusCourse",photolist);
        return "free06";
    }
    
    @GetMapping("/testbuy")
    public String getCourseSessions6(Model m) {
        return "testbuy";
    }
    
    @GetMapping("/testcarttt")
    public String getCourseSessions7(Model m) {
        return "testcarttt";
    }
}
