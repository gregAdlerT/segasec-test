package com.mycompany.myapp.service;

import com.mycompany.myapp.api.ApiConstants;
import com.mycompany.myapp.domain.Author;
import com.mycompany.myapp.repository.AuthorRepository;
import com.mycompany.myapp.service.dto.ReviewDto;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Author}.
 */
@Service
@Transactional
public class AuthorService {

    @Value("${reviewServerKey}")
    private String reviewsKey;

    private final Logger log = LoggerFactory.getLogger(AuthorService.class);

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /**
     * Save a author.
     *
     * @param author the entity to save.
     * @return the persisted entity.
     */
    public ReviewDto getReview(String author) throws Exception {
        System.out.println(ApiConstants.REVIEW_RESOURCE_URL+author+"&api-key="+reviewsKey);//////////
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ReviewDto> response
            = restTemplate.getForEntity(ApiConstants.REVIEW_RESOURCE_URL+author+"&api-key="+reviewsKey, ReviewDto.class);

        return response.getBody();
    }

    public Author save(Author author) {
        log.debug("Request to save Author : {}", author);
        return authorRepository.save(author);
    }

    /**
     * Get all the authors.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Author> findAll(Pageable pageable) {
        log.debug("Request to get all Authors");
        return authorRepository.findAll(pageable);
    }


    /**
     * Get one author by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Author> findOne(Long id) {
        log.debug("Request to get Author : {}", id);
        return authorRepository.findById(id);
    }

    /**
     * Delete the author by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Author : {}", id);
        authorRepository.deleteById(id);
    }
}
