package splittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @date: 2018/4/28
 * @author: Mr.zxy
 * message:
 */
public class SpitWebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    /**
     * 该方法将一个或者多个路径映射到DispathcerServlet
     * 映射是  /  表示他会是应用的默认servlet
     * 他会处理所有的进入应用的请求。
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
