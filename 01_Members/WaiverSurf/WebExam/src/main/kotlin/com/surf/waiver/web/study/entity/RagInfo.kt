package com.surf.waiver.web.study.entity
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "rag_info")
data class RagInfo(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long,

        @Column(name = "nick_name")
        var nickName : String,

        @Enumerated(EnumType.STRING)
        @Column(name = "job_class")
        var jobClass : JobClass,

        @Column(name = "level")
        var level : Int,

        @CreatedDate
        @Column(name = "created_at")
        val createdAt : LocalDateTime,

        @Column(name = "updated_at")
        @LastModifiedDate
        val updatedAt : LocalDateTime
)

enum class JobClass{
    SWRODMAN, ARCHER, MAGICTION
}