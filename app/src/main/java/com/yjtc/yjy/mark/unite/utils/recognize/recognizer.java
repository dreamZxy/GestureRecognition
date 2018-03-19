package com.yjtc.yjy.mark.unite.utils.recognize;
/**
 * 手写识别库
 * Created by zxy on 2016/5/18.
 */
public class recognizer {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("recognizer-lib");
    }

    /**
     * 初始化
     */
    public static native boolean recognizer_init();

    /**
     * 每次识别完clear一下
     */
    public static native boolean recognizer_clear();

    /**
     * 添加x,y坐标
     */
    public static native boolean recognizer_add(int x, int y);

    /**
     * 识别，返回识别结果
     */
    public static native int recognizer_classify();

    /**
     * 打印Log检测用 ：得到对应下标的x坐标
     */
    public static native int recognizer_getx(int i);

    /**
     * 打印Log检测用 ：得到对应下标的y坐标
     */
    public static native int recognizer_gety(int i);

    /**
     * 识别结束，将库逆向初始化
     */
    public static native boolean recognizer_deInit();

    /*
    *打印Log检测用：获取最终识别方向
    * */
    public static native String recognizer_getDirectionStr();

    /**
     * @return 返回显著的点的数目
     */
    public static native int recognizer_getResultCnt();
}
