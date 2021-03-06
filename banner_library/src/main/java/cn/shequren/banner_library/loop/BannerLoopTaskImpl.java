package cn.shequren.banner_library.loop;

import cn.shequren.banner_library.Ui.FlexibleBanner;

import java.lang.ref.WeakReference;

/**
 * @author Loren
 * Create_Time: 2019/9/10 15:07
 * description:
 */
public abstract class BannerLoopTaskImpl implements Runnable {

    protected final WeakReference<FlexibleBanner> reference;

   public BannerLoopTaskImpl(FlexibleBanner flexibleBanner) {
        this.reference = new WeakReference<FlexibleBanner>(flexibleBanner);
    }

    @Override
    public void run() {
        handle();

    }

    public abstract  void  handle();
}
