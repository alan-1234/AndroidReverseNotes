package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.m.g;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.List;
import java.util.Map;

public class ReshapeCombineFilter extends VideoFilterBase {
    public static final String FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ReshapeCombineFragmentShader.dat");
    public static final String VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ReshapeCombineVertexShader.dat");
    public static final int XCOORD_NUM = 128;
    public static final int YCOORD_NUM = 128;
    private int eyeMaskTex = 0;
    private List<PointF> mFullscreenVerticesPortrait = VideoMaterialUtil.genFullScreenVertices(128, 128, 0.0f, 1.0f, 0.0f, 1.0f);
    private List<PointF> mInitTextureCoordinatesPortrait = VideoMaterialUtil.genFullScreenVertices(128, 128, 0.0f, 1.0f, 0.0f, 1.0f);
    private float[] positionArray = null;
    private float[] size = new float[]{1.0f, 1.0f};
    private float[] vectorMapSize = new float[]{1.0f, 1.0f};

    static {
        AppMethodBeat.i(82752);
        AppMethodBeat.o(82752);
    }

    public ReshapeCombineFilter() {
        super(VERTEX_SHADER, FRAGMENT_SHADER);
        AppMethodBeat.i(82745);
        initParams();
        AppMethodBeat.o(82745);
    }

    public ReshapeCombineFilter(float f, float f2, float f3, float f4) {
        super(VERTEX_SHADER, FRAGMENT_SHADER);
        AppMethodBeat.i(82746);
        this.mFullscreenVerticesPortrait = VideoMaterialUtil.genFullScreenVertices(128, 128, f, f2, f3, f4);
        initParams();
        AppMethodBeat.o(82746);
    }

    public void updateSize(float f, float f2, float f3, float f4) {
        AppMethodBeat.i(82747);
        if (this.positionArray == null) {
            this.positionArray = new float[(this.mFullscreenVerticesPortrait.size() * 2)];
        }
        VideoMaterialUtil.genFullScreenVertices(this.positionArray, 128, 128, f, f2, f3, f4);
        setPositions(this.positionArray, false);
        AppMethodBeat.o(82747);
    }

    public void initParams() {
        AppMethodBeat.i(82748);
        addParam(new n("inputImageTexture2", this.eyeMaskTex, 33986));
        addParam(new g("size", this.size));
        addParam(new g("vectorMapSize", this.vectorMapSize));
        AppMethodBeat.o(82748);
    }

    public void initAttribParams() {
        AppMethodBeat.i(82749);
        setPositions(VideoMaterialUtil.toFlatArray((PointF[]) this.mFullscreenVerticesPortrait.toArray(new PointF[0])), false);
        setTexCords(VideoMaterialUtil.toFlatArray((PointF[]) this.mInitTextureCoordinatesPortrait.toArray(new PointF[0])), false);
        setCoordNum(32897);
        AppMethodBeat.o(82749);
    }

    public void ApplyGLSLFilter() {
        AppMethodBeat.i(82750);
        initParams();
        super.ApplyGLSLFilter();
        setDrawMode(DRAW_MODE.TRIANGLE_STRIP);
        AppMethodBeat.o(82750);
    }

    public void setParam(Map<String, Object> map) {
        AppMethodBeat.i(82751);
        if (map == null || map.isEmpty()) {
            AppMethodBeat.o(82751);
            return;
        }
        if (map.containsKey("inputImageTexture2")) {
            this.eyeMaskTex = ((Integer) map.get("inputImageTexture2")).intValue();
        }
        if (map.containsKey("size")) {
            this.size = (float[]) map.get("size");
        }
        if (map.containsKey("vectorMapSize")) {
            this.vectorMapSize = (float[]) map.get("vectorMapSize");
        }
        initParams();
        AppMethodBeat.o(82751);
    }
}
