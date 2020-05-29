package org.jcpl.letagent.view;

import org.jcpl.letagent.view.model.ImageRes;
import org.jcpl.letagent.view.resolver.impl.JcImageViewResolver;
import org.springframework.web.servlet.ModelAndView;

import java.awt.image.BufferedImage;

/**
 * @author Administrator
 */
public class JcImageView extends ModelAndView {

    private ImageRes imageRes;

    public JcImageView(BufferedImage buf) throws Exception {
        this(buf, ImageRes.JPG);
    }

    public JcImageView(BufferedImage buf, String type) throws Exception {
        this.imageRes = new ImageRes(buf, type);
        super.setView(new JcImageViewResolver(this.imageRes));
    }
}
