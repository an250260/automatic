package mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    // Static Resource Config 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
        //registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
        //registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
        
        // Css resource.
        registry.addResourceHandler("/manage/css/**") //
                  .addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/manage/image/**") //
        .addResourceLocations("/WEB-INF/resources/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/manage/js/**") //
        .addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);
        
        // mail resource
        registry.addResourceHandler("/manage/mail/css/**") //
        .addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/manage/mail/image/**") //
        .addResourceLocations("/WEB-INF/resources/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/manage/mail/js/**") //
        .addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);
        
        // affiliates resource
        registry.addResourceHandler("/manage/affiliates/css/**") //
        .addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/manage/affiliates/image/**") //
        .addResourceLocations("/WEB-INF/resources/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/manage/affiliates/js/**") //
        .addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);
        
        // partner resource
        registry.addResourceHandler("/partner/affiliates/css/**") //
        .addResourceLocations("/WEB-INF/resources/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/partner/affiliates/image/**") //
        .addResourceLocations("/WEB-INF/resources/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/partner/affiliates/js/**") //
        .addResourceLocations("/WEB-INF/resources/js/").setCachePeriod(31556926);
    }
 
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
}
