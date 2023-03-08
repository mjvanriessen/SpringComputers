/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Spring 2023
 * Mar 7, 2023
 */
package computers.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import computers.beans.Computer;

@Repository
public interface IComputersRepo extends JpaRepository<Computer, Long>{}


