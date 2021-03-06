package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.acm */
public final class acm extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(37.689205f, 9.6f);
                l.lineTo(34.310795f, 9.6f);
                l.lineTo(32.377216f, 17.334318f);
                l.lineTo(30.435577f, 17.931427f);
                l.cubicTo(29.3022f, 18.279972f, 28.206543f, 18.734787f, 27.161264f, 19.28902f);
                l.lineTo(25.365543f, 20.241161f);
                l.lineTo(18.526829f, 16.137932f);
                l.lineTo(16.137932f, 18.526829f);
                l.lineTo(20.241161f, 25.365543f);
                l.lineTo(19.28902f, 27.161264f);
                l.cubicTo(18.734787f, 28.206543f, 18.279972f, 29.3022f, 17.931427f, 30.435577f);
                l.lineTo(17.334318f, 32.377216f);
                l.lineTo(9.6f, 34.310795f);
                l.lineTo(9.6f, 37.689205f);
                l.lineTo(17.334318f, 39.622784f);
                l.lineTo(17.931427f, 41.564423f);
                l.cubicTo(18.279972f, 42.6978f, 18.734787f, 43.793457f, 19.28902f, 44.838734f);
                l.lineTo(20.241161f, 46.634457f);
                l.lineTo(16.137932f, 53.47317f);
                l.lineTo(18.526829f, 55.86207f);
                l.lineTo(25.365543f, 51.75884f);
                l.lineTo(27.161264f, 52.71098f);
                l.cubicTo(28.206543f, 53.265213f, 29.3022f, 53.720028f, 30.435577f, 54.068573f);
                l.lineTo(32.377216f, 54.665684f);
                l.lineTo(34.310795f, 62.4f);
                l.lineTo(37.689205f, 62.4f);
                l.lineTo(39.622784f, 54.665684f);
                l.lineTo(41.564423f, 54.068573f);
                l.cubicTo(42.6978f, 53.720028f, 43.793457f, 53.265213f, 44.838734f, 52.71098f);
                l.lineTo(46.634457f, 51.75884f);
                l.lineTo(53.47317f, 55.86207f);
                l.lineTo(55.86207f, 53.47317f);
                l.lineTo(51.75884f, 46.634457f);
                l.lineTo(52.71098f, 44.838734f);
                l.cubicTo(53.265213f, 43.793457f, 53.720028f, 42.6978f, 54.068573f, 41.564423f);
                l.lineTo(54.665684f, 39.622784f);
                l.lineTo(62.4f, 37.689205f);
                l.lineTo(62.4f, 34.310795f);
                l.lineTo(54.665684f, 32.377216f);
                l.lineTo(54.068573f, 30.435577f);
                l.cubicTo(53.720028f, 29.3022f, 53.265213f, 28.206543f, 52.71098f, 27.161264f);
                l.lineTo(51.75884f, 25.365543f);
                l.lineTo(55.86207f, 18.526829f);
                l.lineTo(53.47317f, 16.137932f);
                l.lineTo(46.634457f, 20.241161f);
                l.lineTo(44.838734f, 19.28902f);
                l.cubicTo(43.793457f, 18.734787f, 42.6978f, 18.279972f, 41.564423f, 17.931427f);
                l.lineTo(39.622784f, 17.334318f);
                l.lineTo(37.689205f, 9.6f);
                l.close();
                l.moveTo(46.525154f, 16.108458f);
                l.lineTo(52.022694f, 12.809935f);
                l.cubicTo(53.20312f, 12.101678f, 54.714096f, 12.287687f, 55.6875f, 13.261093f);
                l.lineTo(58.738907f, 16.3125f);
                l.cubicTo(59.71231f, 17.285906f, 59.898323f, 18.79688f, 59.190067f, 19.977308f);
                l.lineTo(55.891544f, 25.474846f);
                l.cubicTo(56.547363f, 26.711716f, 57.091198f, 28.017067f, 57.509537f, 29.377384f);
                l.lineTo(63.727608f, 30.931902f);
                l.cubicTo(65.06311f, 31.265778f, 66.0f, 32.465725f, 66.0f, 33.84233f);
                l.lineTo(66.0f, 38.15767f);
                l.cubicTo(66.0f, 39.534275f, 65.06311f, 40.734222f, 63.727608f, 41.0681f);
                l.lineTo(57.509537f, 42.622616f);
                l.cubicTo(57.091198f, 43.982933f, 56.547363f, 45.288284f, 55.891544f, 46.525154f);
                l.lineTo(59.190067f, 52.022694f);
                l.cubicTo(59.898323f, 53.20312f, 59.71231f, 54.714096f, 58.738907f, 55.6875f);
                l.lineTo(55.6875f, 58.738907f);
                l.cubicTo(54.714096f, 59.71231f, 53.20312f, 59.898323f, 52.022694f, 59.190067f);
                l.lineTo(46.525154f, 55.891544f);
                l.cubicTo(45.288284f, 56.547363f, 43.982933f, 57.091198f, 42.622616f, 57.509537f);
                l.lineTo(41.0681f, 63.727608f);
                l.cubicTo(40.734222f, 65.06311f, 39.534275f, 66.0f, 38.15767f, 66.0f);
                l.lineTo(33.84233f, 66.0f);
                l.cubicTo(32.465725f, 66.0f, 31.265778f, 65.06311f, 30.931902f, 63.727608f);
                l.lineTo(29.377384f, 57.509537f);
                l.cubicTo(28.017067f, 57.091198f, 26.711716f, 56.547363f, 25.474846f, 55.891544f);
                l.lineTo(19.977308f, 59.190067f);
                l.cubicTo(18.79688f, 59.898323f, 17.285906f, 59.71231f, 16.3125f, 58.738907f);
                l.lineTo(13.261093f, 55.6875f);
                l.cubicTo(12.287687f, 54.714096f, 12.101678f, 53.20312f, 12.809935f, 52.022694f);
                l.lineTo(16.108458f, 46.525154f);
                l.cubicTo(15.452636f, 45.288284f, 14.9088f, 43.982933f, 14.490464f, 42.622616f);
                l.lineTo(8.272393f, 41.0681f);
                l.cubicTo(6.936892f, 40.734222f, 6.0f, 39.534275f, 6.0f, 38.15767f);
                l.lineTo(6.0f, 33.84233f);
                l.cubicTo(6.0f, 32.465725f, 6.936892f, 31.265778f, 8.272393f, 30.931902f);
                l.lineTo(14.490464f, 29.377384f);
                l.cubicTo(14.9088f, 28.017067f, 15.452636f, 26.711716f, 16.108458f, 25.474846f);
                l.lineTo(12.809935f, 19.977308f);
                l.cubicTo(12.101678f, 18.79688f, 12.287687f, 17.285906f, 13.261093f, 16.3125f);
                l.lineTo(16.3125f, 13.261093f);
                l.cubicTo(17.285906f, 12.287687f, 18.79688f, 12.101678f, 19.977308f, 12.809935f);
                l.lineTo(25.474846f, 16.108458f);
                l.cubicTo(26.711716f, 15.452636f, 28.017067f, 14.9088f, 29.377384f, 14.490464f);
                l.lineTo(30.931902f, 8.272393f);
                l.cubicTo(31.265778f, 6.936892f, 32.465725f, 6.0f, 33.84233f, 6.0f);
                l.lineTo(38.15767f, 6.0f);
                l.cubicTo(39.534275f, 6.0f, 40.734222f, 6.936892f, 41.0681f, 8.272393f);
                l.lineTo(42.622616f, 14.490464f);
                l.cubicTo(43.982933f, 14.9088f, 45.288284f, 15.452636f, 46.525154f, 16.108458f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(36.0f, 44.4f);
                l.cubicTo(40.63919f, 44.4f, 44.4f, 40.63919f, 44.4f, 36.0f);
                l.cubicTo(44.4f, 31.360807f, 40.63919f, 27.6f, 36.0f, 27.6f);
                l.cubicTo(31.360807f, 27.6f, 27.6f, 31.360807f, 27.6f, 36.0f);
                l.cubicTo(27.6f, 40.63919f, 31.360807f, 44.4f, 36.0f, 44.4f);
                l.close();
                l.moveTo(36.0f, 48.0f);
                l.cubicTo(29.372583f, 48.0f, 24.0f, 42.62742f, 24.0f, 36.0f);
                l.cubicTo(24.0f, 29.372583f, 29.372583f, 24.0f, 36.0f, 24.0f);
                l.cubicTo(42.62742f, 24.0f, 48.0f, 29.372583f, 48.0f, 36.0f);
                l.cubicTo(48.0f, 42.62742f, 42.62742f, 48.0f, 36.0f, 48.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
