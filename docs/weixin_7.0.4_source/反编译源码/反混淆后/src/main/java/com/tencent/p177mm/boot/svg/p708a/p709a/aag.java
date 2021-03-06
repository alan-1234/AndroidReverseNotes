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

/* renamed from: com.tencent.mm.boot.svg.a.a.aag */
public final class aag extends C5163c {
    private final int height = 32;
    private final int width = 32;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 32;
            case 1:
                return 32;
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
                Paint a = C5163c.m7876a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                Paint a2 = C5163c.m7876a(k, looper);
                a2.setColor(WebView.NIGHT_MODE_COLOR);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(a2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(4.8703823f, 23.2f);
                l.lineTo(1.8181819f, 23.2f);
                l.cubicTo(1.2558556f, 23.2f, 0.8f, 22.744144f, 0.8f, 22.181818f);
                l.lineTo(0.8f, 18.120138f);
                l.lineTo(2.3047714f, 18.120138f);
                l.lineTo(2.3047714f, 21.8f);
                l.lineTo(4.8703823f, 21.8f);
                l.lineTo(21.666151f, 21.784334f);
                l.lineTo(21.666151f, 18.11097f);
                l.lineTo(23.197655f, 18.11097f);
                l.lineTo(23.197655f, 22.181818f);
                l.cubicTo(23.197655f, 22.744144f, 22.741798f, 23.2f, 22.179474f, 23.2f);
                l.lineTo(4.8703823f, 23.2f);
                l.close();
                l.moveTo(1.8181819f, 0.8f);
                l.lineTo(5.916729f, 0.8f);
                l.lineTo(5.916729f, 2.347675f);
                l.lineTo(2.3225772f, 2.347675f);
                l.lineTo(2.3225772f, 5.883533f);
                l.lineTo(0.8f, 5.883533f);
                l.lineTo(0.8f, 1.8181819f);
                l.cubicTo(0.8f, 1.2558556f, 1.2558556f, 0.8f, 1.8181819f, 0.8f);
                l.close();
                l.moveTo(22.179474f, 0.8f);
                l.cubicTo(22.741798f, 0.8f, 23.197655f, 1.2558556f, 23.197655f, 1.8181819f);
                l.lineTo(23.197655f, 5.9032164f);
                l.lineTo(21.644531f, 5.9032164f);
                l.lineTo(21.644531f, 2.3631027f);
                l.lineTo(18.140741f, 2.3631027f);
                l.lineTo(18.140741f, 0.8f);
                l.lineTo(22.179474f, 0.8f);
                l.close();
                l.moveTo(8.945455f, 0.8f);
                l.lineTo(15.054545f, 0.8f);
                l.lineTo(15.054545f, 2.3272727f);
                l.lineTo(8.945455f, 2.3272727f);
                l.lineTo(8.945455f, 0.8f);
                l.close();
                l.moveTo(0.8f, 8.942418f);
                l.lineTo(2.3272727f, 8.942418f);
                l.lineTo(2.3272727f, 15.037204f);
                l.lineTo(0.8f, 15.037204f);
                l.lineTo(0.8f, 8.942418f);
                l.close();
                l.moveTo(21.672728f, 8.945455f);
                l.lineTo(23.2f, 8.945455f);
                l.lineTo(23.2f, 15.04024f);
                l.lineTo(21.672728f, 15.04024f);
                l.lineTo(21.672728f, 8.945455f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a2, looper);
                a = C5163c.m7876a(a, looper);
                a3.setColor(-100663296);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                a.setStrokeWidth(1.4f);
                l = C5163c.m7884l(looper);
                l.moveTo(3.6129918f, 21.103752f);
                l.lineTo(20.387997f, 21.103752f);
                l.cubicTo(20.26201f, 20.916302f, 20.099764f, 20.75753f, 19.931206f, 20.675081f);
                l.lineTo(14.370157f, 17.954939f);
                l.cubicTo(13.151746f, 17.358963f, 12.857854f, 15.951832f, 13.730429f, 14.914611f);
                l.lineTo(14.085618f, 14.4924f);
                l.cubicTo(14.70045f, 13.761557f, 15.229825f, 12.311421f, 15.229825f, 11.35559f);
                l.lineTo(15.229825f, 9.670945f);
                l.cubicTo(15.229825f, 7.8818307f, 13.782598f, 6.43f, 12.0f, 6.43f);
                l.cubicTo(10.219405f, 6.43f, 8.770175f, 7.8819757f, 8.770175f, 9.670327f);
                l.lineTo(8.770175f, 11.354709f);
                l.cubicTo(8.770175f, 12.312657f, 9.297517f, 13.757827f, 9.914351f, 14.490951f);
                l.lineTo(10.269541f, 14.913103f);
                l.cubicTo(11.143951f, 15.952363f, 10.846876f, 17.358044f, 9.629946f, 17.95354f);
                l.lineTo(4.068897f, 20.67481f);
                l.cubicTo(3.9011364f, 20.756903f, 3.739076f, 20.916063f, 3.6129918f, 21.103752f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a3);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
