package com.yanirta.TestObjects;

import com.applitools.eyes.TestResults;
import com.applitools.eyes.images.Eyes;
import com.yanirta.lib.Config;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageFileTest extends TestBase {
    public ImageFileTest(File file, Config conf) {
        super(file, conf);
    }

    @Override
    public TestResults run(Eyes eyes) throws Exception {
        BufferedImage image = getImage(file());
        eyes.open(appName(), name(), viewport(image));
        eyes.checkImage(image, name());
        image = null;
        return eyes.close(false);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
