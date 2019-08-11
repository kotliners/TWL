package com.surf.waiver.web.study.repository

import com.surf.waiver.web.study.entity.RagInfo
import org.springframework.data.jpa.repository.JpaRepository

interface RagInfoRepository : JpaRepository<RagInfo, Long>{

    fun findByLevel(level: Int) : List<RagInfo>

}