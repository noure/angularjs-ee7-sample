package com.hantsylab.example.ee7.blog.domain.support;

import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hantsy
 */
@MappedSuperclass
@Setter
@Getter
@EntityListeners(AuditEntityListener.class)
public class AbstractAuditableEntity extends AbstractEntity {

    private static final long serialVersionUID = 1L;


 	@Column(name="created_at")
	private OffsetDateTime createdAt;
	
	@Column(name="updated_at")
	private OffsetDateTime updatedAt;
}
