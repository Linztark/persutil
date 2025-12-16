package net.ausiasmarch.persutil.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import net.ausiasmarch.persutil.entity.SilvestreEntity;

public interface SilvestreRepository extends JpaRepository<SilvestreEntity, Long> {

	Page<SilvestreEntity> findByPublicadoTrue(Pageable oPageable);

	Page<SilvestreEntity> findByPublicadoFalse(Pageable oPageable);

	SilvestreEntity findByIdAndPublicadoTrue(Long id);

}
