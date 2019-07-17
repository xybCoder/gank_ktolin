package gank.com.gank_ktolin.model

import gank.com.gank_ktolin.model.bean.GanHuoData
import gank.com.gank_ktolin.net.RetrofitManager
import gank.com.gank_ktolin.utils.IoMainScheduler
import io.reactivex.Observable

class GanHuoModel {

    fun getGanHuo(type: String, page: Int): Observable<GanHuoData> {
        return RetrofitManager.service.getGanHuoData(type, page).compose(IoMainScheduler())
    }
}