package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.da */
public final class C45195da extends C5163c {
    private final int height = 36;
    private final int width = 22;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 22;
            case 1:
                return 36;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-10526881);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -215.0f, 0.0f, 1.0f, -1633.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 126.0f, 0.0f, 1.0f, 1631.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                a = C5163c.m7876a(a, looper);
                g = C5163c.m7878a(g, -0.70710677f, 0.70710677f, 144.65001f, 0.70710677f, 0.70710677f, -59.915993f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = C5163c.m7884l(looper);
                l.moveTo(84.78122f, 28.281223f);
                l.lineTo(84.78122f, 7.281223f);
                l.lineTo(80.28122f, 7.281223f);
                l.lineTo(80.28122f, 30.531223f);
                l.lineTo(80.28122f, 32.781223f);
                l.lineTo(105.78122f, 32.781223f);
                l.lineTo(105.78122f, 28.281223f);
                l.lineTo(84.78122f, 28.281223f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
