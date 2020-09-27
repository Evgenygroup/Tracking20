package com.evgeny.track.repositiory;

import com.evgeny.track.entity.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingRepositiory extends JpaRepository<Tracking,Long> {
}
