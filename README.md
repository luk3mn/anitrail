<!--<a name="anitrail">
    <img src="https://raw.githubusercontent.com/luk3mn/luk3mn/main/soft_cover.png" width="1480">
</a>-->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
![personal][personal-shield]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
![Badge em Desenvolvimento](https://img.shields.io/static/v1?label=STATUS&message=Development&color=GREEN&style=for-the-badge)

<!-- ![image](soft%20(1).png) -->



<!-- PROJECT LOGO -->
<div align="center">

[//]: # (   <img width="300" src="" alt=""/>)
   <h3 align="center">AniTrail</h3>

  <p align="center">
    Backend application to track my anime preferences and provide recommendations by using Generative AI
    <br />
    <a href="https://github.com/luk3mn/anitrail/README.md"><strong>Explore the docs »</strong></a>
    <br />
    <br />
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <!-- <li><a href="#deploy">Deploy</a></li> -->
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#authors">Authors</a></li>
    <li><a href="#feedback">Feedback</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

<div align="center">

[//]: # (    <img width=1000 src="" alt=""/>)
</div>



<p align="justify">

</p>

<p align="right">(<a href="#anitrail">back to top</a>)</p>

### Built With

* [![Java][Java]][Java-url]
* [![Spring][Spring]][Spring-url]
* [![PostgreSQL][PostgreSQL]][PostgreSQL-url]

<p align="right">(<a href="#anitrail">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

Here are some important topics about this project and how to replay it.

### Prerequisites

* [Docker](https://docs.docker.com/)
* [Docke Compose](https://docs.docker.com/compose/)

### Installation

_Before starting this application in your local environment, it'll be necessary to proceed with some tasks to reproduce this project._

1. Clone the repo
   ```shell
   git clone https://github.com/luk3mn/anitrail.git
   ```
2. PostgreSQL database set up
   ```shell
   sudo docker-compose up -d
   ```


<p align="right">(<a href="#anitrail">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
<!-- ## Usage -->

<!-- Deploy -->
<!-- ## Deploy -->


<!-- ROADMAP -->
## Roadmap

- [x] Project initial configuration
- [ ] Build an API request
- [ ] API response analysis
- [ ] Build a method get JSON API response amd convert to Java class object
- [ ] Mapping java class to PostgreSQL (ORM)
- [ ] POST /anime/search (title, score)
- [ ] Build Gemini API request
- [ ] GET /anime/recommendation -> integrate with Gemini

<p align="right">(<a href="#anitrail">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#anitrail">back to top</a>)</p>



## Authors

- username: [@luk3mn](https://www.github.com/luk3mn)

## Feedback

If you have any feedback, please reach out to us at lucasnunes2030@gmail.com

> Project Link: [https://github.com/luk3mn/anitrail](https://github.com/luk3mn/anitrail)

<p align="right">(<a href="#anitrail">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments
* [Get Started with Gemini in Java](https://medium.com/google-cloud/get-started-with-gemini-in-java-923f2069ea4d)


<p align="right">(<a href="#anitrail">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/luk3mn/anitrail.svg?style=for-the-badge
[contributors-url]: https://github.com/luk3mn/anitrail/graphs/contributors
[issues-shield]: https://img.shields.io/github/issues/luk3mn/anitrail.svg?style=for-the-badge
[issues-url]: https://github.com/luk3mn/anitrail/issues
[forks-shield]: https://img.shields.io/github/forks/luk3mn/anitrail.svg?style=for-the-badge
[forks-url]: https://github.com/luk3mn/anitrail/network/members
[stars-shield]: https://img.shields.io/github/stars/luk3mn/anitrail.svg?style=for-the-badge
[stars-url]: https://github.com/luk3mn/anitrail/stargazers
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/luk3mn/anitrail/blob/master/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/lucasmaues/
[personal-shield]: https://img.shields.io/static/v1?label=ORACLE_ONE&message=ALURA&color=2e3643&style=for-the-badge&colorB=555

<!-- Stack Shields -->
[Java]: https://img.shields.io/badge/Java-E02027?style=for-the-badge&logo=java&logoColor=ffffff
[Java-url]: https://www.java.com/en/
[Spring]: https://img.shields.io/badge/SrpingBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=ffffff
[Spring-url]: https://spring.io/projects/spring-boot
[PostgreSQL]: https://img.shields.io/badge/POSTGRESQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=ffffff
[PostgreSQL-url]: https://www.postgresql.org/
